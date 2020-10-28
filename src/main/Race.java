/*  Created by Intellij IDEA.
 *   Author : Mukul Agarawal
 *   Date   : 28/10/2020
 *   File   : Race.java
 */
package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.run();
    }
}
