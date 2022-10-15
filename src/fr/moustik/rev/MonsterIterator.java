package fr.moustik.rev;

public interface MonsterIterator {
    boolean hasNext();

    LivingThing getNext();

    void reset();
}
