package io.github.danioscx.ecommerce.client.member.utils;

public enum DiscountType {
    PERCENT("percent"),
    NOMINAL("nominal");

    final String text;

    DiscountType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
