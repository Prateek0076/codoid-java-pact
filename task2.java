import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import  java.util.Scanner;

public class read {
    public static void main(String[] args) throws FilloException {


            Scanner input = new Scanner(System.in);
            System.out.print("enter the name to search : ");
            java.lang.String name = input.next();
//            System.out.print("enter the id to search : ");
//            int id = input.nextInt();

            System.out.println();


    Fillo fillo = new Fillo();
    Connection connection = fillo.getConnection("C:\\Users\\Vijip\\Desktop\\codoid testing\\java pact\\excel read\\fillo\\src\\read.xlsx");
    java.lang.String strQuery = "Select * from Sheet1 where NAME = '+ name +'";
        System.out.println("=========sql query======: "+strQuery);
    Recordset recordset = connection.executeQuery(strQuery);

    while (recordset.next()) {
        System.out.println("ID : "+recordset.getField("ID"));
        System.out.println("NAME : "+recordset.getField("name"));
        System.out.println("ROLE : "+recordset.getField("Details"));
    }

    recordset.close();
    connection.close();

    }
}
