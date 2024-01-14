package Test;

import java.awt.Rectangle;
import java.util.List;

import javax.swing.text.Document;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bankstatemet {
    private static final String FILE = "C:\\Users\\Admin\\Documents\\BankStatement.pdf";

    public static void generateStatement() throws FileNotFoundException, DocumentException {
        Rectangle rectangle = new Rectangle(PageSize.A4);

        Document document = new Document(rectangle);
        log.info("setting size of document");
        OutputStream outputStream = new FileOutputStream(FILE);
        PdfWriter.getInstance(document, outputStream);
        document.open();
        document.add(new Paragraph("Sample text"));
        document.add(new Chunk("TJA Bank Statement"));
        document.add(new Phrase("I'm enjoying this"));

        document.add(new Paragraph(" "));

        Anchor anchor = new Anchor("IACADEMY");
        anchor.setReference("https://www.iacademy.org");

        List orderedList = new List(List.ORDERED);
        orderedList.add(new ListItem("Emperor"));
        orderedList.add(new ListItem("Noah"));

        List unOrderedList = new List(List.UNORDERED);
        unOrderedList.add(new ListItem("Testing"));
        unOrderedList.add(new ListItem("Testing2"));

        log.info("populating list");
        String[] firstNamesArray = {"Adeolu", "Oyin", "Noah"};
        String[] lastNamesArray = {"Oduniyi", "Alasoluyi", "Johnson"};
        log.info("setting table to 3 columns");
        PdfPTable table = new PdfPTable(3);
        PdfPCell serialNo = new PdfPCell(new Paragraph("S/N"));
        PdfPCell names = new PdfPCell(new Paragraph("FirstName"));
        PdfPCell lastname = new PdfPCell(new Paragraph("Lastname"));

        table.addCell(serialNo);
        table.addCell(names);
        table.addCell(lastname);
        for (int i=0; i< firstNamesArray.length; i++){
            PdfPCell serialNo1 = new PdfPCell(new Paragraph(String.valueOf(i+1)));
            PdfPCell firstName = new PdfPCell(new Paragraph(firstNamesArray[i]));
            PdfPCell lastName = new PdfPCell(new Paragraph(lastNamesArray[i]));


            table.addCell(serialNo1).setBackgroundColor(BaseColor.BLUE);
            table.addCell(firstName);
            table.addCell(lastName);
        }

        document.add(table);
        document.add(orderedList);
        document.add(unOrderedList);

        document.add(anchor);

        document.close();

        log.info("File has been created!");


    }

    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        generateStatement();
    }

}
