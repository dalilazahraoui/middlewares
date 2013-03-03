package dao;

import java.util.*;
import jpa.*;

public interface Idao {
// liste des clients
public List<Geonotesentity> getAllGeonotesentity();
// liste des GeoNotes
public List<Geotripentity> getAllGeotripentity();
// liste des GeoTrips

public Geonotesentity getGeoNoteById(Long id);
// trouver une GeoNote idenbtifié par son id
public Geotripentity getGeoTripById(Long id);
// trouver un GeoTrip identifié par son id
}