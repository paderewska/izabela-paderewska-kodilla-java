package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private ConfirmationService confirmationService;
    private ParcelSending parcelSending;
    private DatabaseUpdate databaseUpdate;

    public ProductOrderService(final ConfirmationService confirmationService, final ParcelSending parcelSending, final DatabaseUpdate databaseUpdate) {
        this.confirmationService = confirmationService;
        this.parcelSending = parcelSending;
        this.databaseUpdate = databaseUpdate;
    }

    public ProductDto process(final Purchase purchase) {
        boolean isBought = confirmationService.sendConfirmation(purchase.getUser(), purchase.getPurchaseData());

        if(isBought) {
            parcelSending.sendTheParcel(purchase.getUser());
            databaseUpdate.updateDatabase(purchase.getUser(), purchase.getPurchaseData());
            return new ProductDto(purchase.getUser(), true);
        } else {
            return new ProductDto(purchase.getUser(), false);
        }
    }
}

