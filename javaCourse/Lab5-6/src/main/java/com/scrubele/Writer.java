package com.scrubele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Writer {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE = "..\\text.csv";

    public void writeToFile(CosmeticDepartment shop) throws IOException {
        FileWriter writer = null;
        try {

            writer = new FileWriter(FILE);
            List<BeatyProduct> productList = shop.getProductList();
            for (BeatyProduct product : productList) {
                writer.append(product.getHeaders());
                writer.append(NEW_LINE_SEPARATOR);
                writer.append(product.toCSV());
                writer.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }


    }

    private static final int BEATY_PRODUCT_NAME = 0;
    private static final int BEATY_PRODUCT_PRICE = 1;
    private static final int BEATY_PRODUCT_TYPE = 2;
    private static final int BEATY_PRODUCT_QUANTITY = 3;
    private static final int BEATY_PRODUCT_TASTE = 4;
    private static final int BEATY_PRODUCT_HAIRTYPE = 4;
    private static final int BEATY_PRODUCT_COLORCODE = 5;
    private static final int BEATY_PRODUCT_CAPASITY = 5;

    public List<BeatyProduct> readCsvFile(ProductType productType) {

       // null;
        List<BeatyProduct> beatyProducts = new LinkedList<>();
        try( BufferedReader fileReader = new BufferedReader(new FileReader(FILE))) {


            String line = "";
            fileReader.readLine();

            while ((line = fileReader.readLine()) != null) {
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                    ProductType product = null;
                    try {
                        product = ProductType.valueOf(tokens[BEATY_PRODUCT_TYPE]);

                        if (product.equals(productType)) {

                            if (tokens[BEATY_PRODUCT_TYPE].equals("LIPSTICK")) {
                                Lipstick lipstick = new Lipstick(tokens[BEATY_PRODUCT_NAME],
                                        Double.valueOf(tokens[BEATY_PRODUCT_PRICE]),
                                        ProductType.valueOf(tokens[BEATY_PRODUCT_TYPE]),
                                        Integer.parseInt(tokens[BEATY_PRODUCT_QUANTITY]),
                                        LipstickTaste.valueOf(tokens[BEATY_PRODUCT_TASTE]),
                                        Integer.parseInt(tokens[BEATY_PRODUCT_COLORCODE]));
                              } else if (tokens[BEATY_PRODUCT_TYPE] == "HAIRCONDITIONERS") {
                                HairProduct hairProduct = new HairProduct(tokens[BEATY_PRODUCT_NAME],
                                        Double.parseDouble(tokens[BEATY_PRODUCT_PRICE]),
                                        ProductType.valueOf(tokens[BEATY_PRODUCT_TYPE]),
                                        Integer.parseInt(tokens[BEATY_PRODUCT_QUANTITY]),
                                        HairType.valueOf(tokens[BEATY_PRODUCT_HAIRTYPE]),
                                        Integer.parseInt(tokens[BEATY_PRODUCT_CAPASITY]));
                                beatyProducts.add(hairProduct);
                            } else {

                                BeatyProduct beatyProduct = new BeatyProduct(tokens[BEATY_PRODUCT_NAME],
                                        Double.valueOf(tokens[BEATY_PRODUCT_PRICE]),
                                        ProductType.valueOf(tokens[BEATY_PRODUCT_TYPE]),
                                        Integer.parseInt(tokens[BEATY_PRODUCT_QUANTITY]));
                                beatyProducts.add(beatyProduct);

                            }

                        }
                    } catch (NumberFormatException e) {

                    } catch (NullPointerException e) {

                    }

                }
            }

            //Print the new beaty product list

            }
         catch (Exception e) {
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        }
        return beatyProducts;

    }

}

