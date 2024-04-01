package de.hitohitonika.heimplaner_spring_server.entities.dao;

import de.hitohitonika.heimplaner_spring_server.entities.Household;

import java.util.List;

/**
 * Data Access Object (DAO) for managing households.
 */
public class HouseholdDao {

    /**
     * Saves a new household to the database.
     *
     * @param household The household to be saved.
     */
    public void saveHousehold(Household household) {
        // Implementation
    }

    /**
     * Retrieves a household from the database by ID.
     *
     * @param householdId The ID of the household to retrieve.
     * @return The retrieved household, or null if not found.
     */
    public Household getHouseholdById(int householdId) {
        // Implementation
        return null;
    }

    /**
     * Retrieves all households from the database.
     *
     * @return A list of all households.
     */
    public List<Household> getAllHouseholds() {
        // Implementation
        return null;
    }

    /**
     * Updates an existing household in the database.
     *
     * @param household The household to be updated.
     */
    public void updateHousehold(Household household) {
        // Implementation
    }

    /**
     * Deletes a household from the database.
     *
     * @param householdId The ID of the household to delete.
     */
    public void deleteHousehold(int householdId) {
        // Implementation
    }
}

