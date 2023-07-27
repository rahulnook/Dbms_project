# Dbms_project
## Property Rental Agency (PRA) Database Project

## Entities

- **User:** Represents both Owners and Tenants with adharID, name, age, address, and multiple phone numbers.
- **Property:** Can be residential (independent-house/flat) or commercial (shop or warehouse) with a unique ID. Each property has an owner and various property details.
- **PropertyRent:** Contains details of properties rented to tenants, such as rent per month, start_date, end_date, yearly hike in rent, agency commission, etc.

## Functionality

- **Adding Users:** The DBA adds users to the database with necessary privileges. Managers can also add users with limited permissions.
- **Property Management:** DBA and Managers can add, delete, and update any property record. Owners can only manage their own property records.
- **Property Rent Details:** Admin and Managers can add property rent details after a property is rented to a tenant.
- **Rent History Report:** Generate a report on the rent history of a specific property.
- **Property Search:** Allow users to search for available properties for rent within a given city/locality/price range.
- **Property Status Check:** Users can check the status of a property using its ID.
- **Tenant Privileges:** Tenants can only view available properties for rent and cannot modify any data in the database.

## Entities Attributes

- **User:** adharID (PK), name, age, address, phone numbers, login credentials
- **Property:** propertyID (PK), owner (FK to User.adharID), available from date, available till date, rent per month, annual hike in rent, total area, plinth area, number of bedrooms (for residential), number of floors, year of construction, locality, address, facilities, property type
- **PropertyRent:** rentID (PK), propertyID (FK to Property.propertyID), tenant (FK to User.adharID), rent per month, start_date, end_date, yearly hike in rent, agency commission, other info

## Project Scope

The project involves ER/EER Modeling, relational schema design, and refinement (Normalization). It includes creating database tables with constraints and inserting initial data. SQL/PL-SQL code will be written for data entry, updates, generating reports, and enforcing complex constraints or rules. The database will be used to manage property rentals, users, and rental history across multiple cities in India.


