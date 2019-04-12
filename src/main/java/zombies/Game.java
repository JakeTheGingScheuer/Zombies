package zombies;

import java.util.HashSet;
import java.util.Set;

public class Game {
    Set<Survivor> survivors;

    public Game() {
        survivors = new HashSet<>();
    }

    public int getNumberOfSurvivors() {
        return survivors.size();
    }

    public void addSurvivor(Survivor survivor) throws DuplicateNameException {

        boolean added = survivors.add(survivor);
        if(!added){
            throw new DuplicateNameException(survivor.getName()+" is taken");
        }
    }
}

