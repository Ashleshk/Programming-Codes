package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    TableView<Product> tables;
    TextField nameinput, priceInput, qauntityinput;

    public static void main(String[] args) {
	 launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("title here");

        //name column
        TableColumn<Product,String> nameColumn = new TableColumn<>("name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //price column
        TableColumn<Product,Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //quantity column
        TableColumn<Product,String> qauntityColumn = new TableColumn<>("Qauntity");
        qauntityColumn.setMinWidth(100);
        qauntityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        //name input
        nameinput = new TextField();
        nameinput.setPromptText("Name");
        nameinput.setMinWidth(100);

        //price input
        priceInput = new TextField();
        priceInput.setPromptText("Price");


        //quantity input
        qauntityinput = new TextField();
        qauntityinput.setPromptText("Qauntity");


        //Buttons Add delete
        Button addbutton = new Button("Add");
        Button deletebutton = new Button("Delete");

        addbutton.setOnAction(e-> {
            boolean val = false;
            val = checkValidation();
            if (val) {
                addbuttonClicked();
            }
        });
        deletebutton.setOnAction(e->{deletebuttonClicked();});

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameinput,priceInput,qauntityinput,addbutton,deletebutton);


        tables=new TableView<>();
        tables.setItems(getProduct());
        tables.getColumns().addAll(nameColumn,priceColumn,qauntityColumn);



        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll( tables,hBox);
        Scene scene = new Scene(layout,800,500);


        window.setScene(scene);

        window.show();
    }

    private boolean checkValidation() {
        boolean strbool=false;
        try{
            double price=Double.parseDouble(priceInput.getText());
            int qty=Integer.parseInt(qauntityinput.getText());
            String name=nameinput.getText();
            String regex = "^[a-zA-Z]+$";
            if (name.matches(regex)) {
                strbool =true;
            }
            else
            {
                strbool=false;
                alertError("Name entered is not string type");

            }


        }catch (NumberFormatException e)
        {
            System.out.println("Error :  is not an double or integer");
            alertError("Price is not double type or Qauntity is not integer ");
            //e.printStackTrace();
             strbool=false;
        }

     return strbool;

    }


    private void alertError(String s) {
        Alert alert =new Alert(Alert.AlertType.NONE);
        alert.setAlertType(Alert.AlertType.ERROR);
        alert.setContentText(s);
        alert.show();
        clearInputFields();
    }

    public void deletebuttonClicked() {
        ObservableList<Product> productselected,allproducts;
        allproducts = tables.getItems();
        productselected=tables.getSelectionModel().getSelectedItems();
        productselected.forEach(allproducts::remove);

    }

    public void addbuttonClicked() {
        Product product = new Product();
        product.setName(nameinput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(qauntityinput.getText()));
        tables.getItems().add(product);
        clearInputFields();
    }

    private void clearInputFields() {
        nameinput.clear();
        priceInput.clear();
        qauntityinput.clear();
    }

    public ObservableList<Product> getProduct()
    {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("laptop",859,20) );
        products.add(new Product("bouncy ball",2.49,198) );
        products.add(new Product("Toliet",99,745) );
        products.add(new Product("The dvd player",19.99,46) );
        products.add(new Product("The Nnotebook",19.50,50) );
        products.add(new Product("Corn",1.49,10) );
        return products;

    }
}
