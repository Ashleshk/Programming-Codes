package com.lti.service;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lti.dto.PolicyDto;
import com.lti.model.Claim;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;

import ch.qos.logback.core.pattern.SpacePadder;

public class PDFExporter {

	private Vehicle vehicle;
	
	private Plan plan;
	
	private User user;

	public PDFExporter(Vehicle vehicle, Plan plan, User user) {
		this.plan=plan;
		this.vehicle=vehicle;
		this.user=user;
	}

	private void writeTableHeader(PdfPTable table) {
		PdfPCell cell=new PdfPCell();
		cell.setBackgroundColor(Color.BLUE);
		cell.setPadding(5);
		
		Font font =FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(Color.WHITE);
		
		cell.setPhrase(new Phrase("vehicleType",font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("manufacturer",font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("vehicleModel",font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("purchaseDate",font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("registration Number",font));
		table.addCell(cell);
		
	}
	private void writePlanTableHeader(PdfPTable table) {
		PdfPCell cell=new PdfPCell();
		cell.setBackgroundColor(Color.YELLOW);
		cell.setPadding(5);
		
		Font font =FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(Color.BLUE);
		
		cell.setPhrase(new Phrase("plan Type",font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("plan year",font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("amount paid",font));
		table.addCell(cell);
		
		
	}
	private void writeTableData(PdfPTable table) {
		
			table.addCell(vehicle.getVehicleType());
			table.addCell(vehicle.getManufacturer());
			table.addCell(vehicle.getVehicleModel());
			table.addCell((vehicle.getPurchaseDate()).toString());
			table.addCell(vehicle.getRegistrationNumber());
			
	}
	private void writePlanTableData(PdfPTable table) {
		table.addCell(plan.getPlanType());	
		table.addCell(String.valueOf(plan.getYear()));
		table.addCell(String.valueOf(plan.getAmount()));
	}
	public void export(HttpServletResponse response) throws DocumentException, IOException {
		Document document= new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		String greet="Hi "+user.getName()+" ,";
		document.open();
		
		Font font =FontFactory.getFont(FontFactory.TIMES_BOLD);
		font.setColor(Color.MAGENTA);
		
		Paragraph  title= new Paragraph("SVAM Services",font);
		title.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(title);
		Paragraph description=new Paragraph(greet);
		description.setSpacingAfter(20);
		description.setSpacingBefore(30);
		document.add(description);
		document.add(new Paragraph("Welcome to SVAM Services."));
		
		Paragraph description1=new Paragraph("Below you can find the details of you registered policy.");
		description1.setSpacingAfter(20);
		document.add(description1);
		
		document.add(new Paragraph("Vehicle Details"));
		
		PdfPTable table=new PdfPTable(5); // no of columns is 2
		table.setWidthPercentage(100);
		table.setSpacingBefore(15);//pixels
		table.setSpacingAfter(20);
		
//		table.setWidths(new float[] {1.5f,3.5f});
		
		writeTableHeader(table); 
		writeTableData(table);
		
		document.add(table);
		
		document.add(new Paragraph("Plan Details"));
		
		PdfPTable planTable=new PdfPTable(3); // no of columns is 2
		planTable.setWidthPercentage(100);
		planTable.setSpacingBefore(15);//pixels
		planTable.setSpacingAfter(20);
		
		writePlanTableHeader(planTable); 
		writePlanTableData(planTable);
		
		document.add(planTable);
		document.add(new Paragraph("Thank you for registering your policy with SVAM Services",font));
		
		document.close();
	}
}
