package ch.fhnw.emoba.spherocontrol.views;

public interface VectorViewListener {

    void onMove(float x, float y, float angle);

    void onRelease();
}