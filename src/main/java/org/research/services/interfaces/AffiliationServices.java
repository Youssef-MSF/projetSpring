package org.research.services.interfaces;

import org.research.beans.Affiliation;


import java.util.List;

public interface AffiliationServices {

    public void create(Affiliation object);
    public void update(Affiliation object);
    public void delete(Affiliation object);
    public Affiliation find(Long id);
    public List<Affiliation> getAll();
}
