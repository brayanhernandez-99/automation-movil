package co.com.android.certification.app.models;

import lombok.Data;

@Data
public class Payment {
    private String phone;
    private String name;
    private String amount;
    private String country;
}