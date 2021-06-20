package org.research.services.interfaces;

import org.research.beans.Comity;

import java.util.List;

public interface ComityServices {

    public void create(Comity object);
    public void update(Comity object);
    public void delete(Comity object);
    public Comity find(Long id);
    public List<Comity> getAll();
}
