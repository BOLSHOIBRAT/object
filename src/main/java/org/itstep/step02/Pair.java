package org.itstep.step02;

public class Pair<F, S> {

    private final F first;
    private final S second;

    /**
     * Создаем объект Pair на базе двух объектов.
     *
     * @param first первый объект
     * @param second второй объект
     */
    public Pair(Object first, Object second) {
        this.first = (F) first;
        this.second = (S) second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}