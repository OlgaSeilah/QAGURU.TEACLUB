package seilah.qaguru.helpers;

public enum Endpoints {

    COMMON_PAGE(""),
    SHOP_PAGE("/shop"),
    CART_PAGE("cart");

    private final String value;

    Endpoints(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;

    }


}
