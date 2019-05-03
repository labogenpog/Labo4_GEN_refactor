package ch.heigvd.gen2019;
import ch.heigvd.gen2019.sizes.*;

import static ch.heigvd.gen2019.sizes.Size.CreateFromInt;

public class Product {
    public static final String SIZE_NOT_APPLICABLE = "Invalid Size";
    private String code;
    private int color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = CreateFromInt(size);
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    String getColorFor() {
        return Color.printColor(getColor());
    }

    String getSizeFor() {
       return this.size.toString();
    }

    String productToString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(getColorFor());
        sb.append("\", ");
        // test class Size only
        if (getSize().toString() != SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(getSizeFor());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");

        return sb.toString();
    }
}