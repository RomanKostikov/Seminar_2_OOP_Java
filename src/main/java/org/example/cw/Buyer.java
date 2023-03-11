package org.example.cw;

public abstract class Buyer implements buyerBehavior{
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();


}
