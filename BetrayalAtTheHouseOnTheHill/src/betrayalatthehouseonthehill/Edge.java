/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betrayalatthehouseonthehill;

/**
 *
 * @author Kevin
 */
public abstract class Edge extends GameObject {
    Tile source, destination;
    private boolean oneWay;
    EdgeType edgeType;

    public Edge(Controller gameController) {
        super(gameController);
    }
    abstract void onAttemptPass(boolean direction);
}
