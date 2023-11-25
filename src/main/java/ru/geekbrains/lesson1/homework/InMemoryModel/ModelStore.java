package ru.geekbrains.lesson1.homework.InMemoryModel;

import ru.geekbrains.lesson1.homework.ModelElements.Camera;
import ru.geekbrains.lesson1.homework.ModelElements.Flash;
import ru.geekbrains.lesson1.homework.ModelElements.PoligonalModel;
import ru.geekbrains.lesson1.homework.ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Хранилище 3D-элементов
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class ModelStore implements ModelChanger {

    public List<PoligonalModel> models = new ArrayList<>();
    public List<Scene> scenes = new ArrayList<>();
    public List<Flash> flashes = new ArrayList<>();
    public List<Camera> cameras = new ArrayList<>();
    private Collection<ModelChangedObserver> observers = new ArrayList<>();

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }

    /**
     * Нотификация изменений на уровне хранилища
     */
    private void notifyChange(){
        for (ModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    public void addModel(PoligonalModel poligonalModel){
        notifyChange();
    }
    public Scene GetScena(int idScene){
        return scenes.get(idScene);
    }
}
