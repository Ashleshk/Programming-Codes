using System;
using System.Data.SqlClient;

namespace SqlConnector
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            using (var sqlConnection = new SqlConnection("Server=.;Database=test;User Id=testuser; Password=123456;"))
            {
                sqlConnection.Open();
                using (var command = new SqlCommand($"INSERT INTO dbo.Users (Id,Username,FirstName,LastName,IsEnabled,CreatedDataUtc,LastLoggedDataUtc) VALUES ('{Guid.NewGuid().ToString("N")}','APOORVA','Apoorva','khajbage',1,'12-10-25 12:32:10 +01:00','12-10-25 12:32:10 +01:00')", sqlConnection))
                {
                    var result = command.ExecuteNonQuery();
                     
                }
                sqlConnection.Close();
            }

            using (var sqlConnection = new SqlConnection("Server=.;Database=test;User Id=testuser; Password=123456;"))
            {
                sqlConnection.Open();
                using (var command = new SqlCommand("SELECT * FROM dbo.Users", sqlConnection))
                {
                    using (var reader = command.ExecuteReader())
                    {
                        while(reader.Read())
                        { 
                       Console.WriteLine($"Username :{reader["Username"]},firstname:{reader["Firstname"]}, LAstname:{reader["Lastname"]}");

                        }
                    }
                }
                sqlConnection.Close();
            }
                Console.ReadLine();
        }
    }
}
