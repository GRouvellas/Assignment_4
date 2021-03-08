/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.model;

import java.util.Random;

/**
 *
 * @author Geo
 */
public enum Size {
    XS, S, M, L, XL, XXL, XXXL;

    public static Size genRandomSize() {
        Random rnd = new Random();
        return values()[rnd.nextInt(values().length)];
    }
}
