package com.hyperwallet.example;

import com.hyperwallet.clientsdk.Hyperwallet;
import com.hyperwallet.clientsdk.model.HyperwalletBankCard;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UpdateBankCard {

    public static void main(String[] args) throws Exception {
        String username = System.getProperty("HYPERWALLET_USERNAME");
        String password = System.getProperty("HYPERWALLET_PASSWORD");

        Hyperwallet client = new Hyperwallet(username,
                                             password,
                                             "prg-44a64920-45fc-4578-a7f9-e14813b3ed54");

        HyperwalletBankCard bankCard = new HyperwalletBankCard()
            .token("trm-3bdcb6c3-022b-4263-bec9-3efce4c4cb35")
            .userToken("usr-0fb6d624-f18d-480d-b1e7-f48f534bbd75")
            .cardNumber("4216701111100115")
            .transferMethodCountry("US")
            .transferMethodCurrency("USD");

        HyperwalletBankCard
            updatedBankCard =
            client.updateBankCard(bankCard);

        System.out.println(ToStringBuilder.reflectionToString(updatedBankCard, new MultilineRecursiveToStringStyle()));
    }
}
