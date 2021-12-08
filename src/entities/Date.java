/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author luisr
 */
public class Date {

    private int day;
    private int mounth;
    private int year;

    private static final int[] daysForMount = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public Date(int day, int mounth, int year) {
        if (mounth <= 0 || mounth > 12) {
            throw new IllegalArgumentException("Mes: " + mounth + " debe estar entre los rangos 1 - 2");
        }

        if (day <= 0 || (day > daysForMount[mounth] && !(mounth == 2 && day == 29))) {
            throw new IllegalArgumentException("Día: " + mounth + " fuera del rango para el mes y año");
        }

        if (mounth == 2 && day == 29 && !(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
            throw new IllegalArgumentException("Día: " + mounth + " fuera del rango para el mes y año");
        }

        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, mounth, year);
    }
}
