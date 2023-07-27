import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class userInterface{
    private JFrame addPropertyPage(JFrame previousFrame, JFrame nextFrame){
        JFrame addPropertyFrame = new JFrame("Add Property");
        addPropertyFrame.setLayout(new BorderLayout());

        addPropertyFrame.setSize(400, 400);
        addPropertyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel addPropertyPanel = new JPanel();
        JLabel addressLabel = new JLabel("Address: ");
        JTextField addressField = new JTextField(20);
        addressField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel cityLabel = new JLabel("City: ");
        JTextField cityField = new JTextField(20);
        cityField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel stateLabel = new JLabel("State: ");
        JTextField stateField = new JTextField(20);
        stateField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel zipLabel = new JLabel("Zip: ");
        JTextField zipField = new JTextField(20);
        zipField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel priceLabel = new JLabel("Price: ");
        JTextField priceField = new JTextField(20);
        priceField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel bedroomsLabel = new JLabel("Bedrooms: ");
        JTextField bedroomsField = new JTextField(20);
        bedroomsField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel bathroomsLabel = new JLabel("Bathrooms: ");
        JTextField bathroomsField = new JTextField(20);
        bathroomsField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel sqftLabel = new JLabel("Sqft: ");
        JTextField sqftField = new JTextField(20);
        sqftField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel descriptionLabel = new JLabel("Description: ");
        JTextField descriptionField = new JTextField(20);
        descriptionField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton addPropertyButton = new JButton("Add Property");

        // On click add property button go to home page
        addPropertyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addPropertyFrame.setVisible(false);
                nextFrame.setVisible(true);
            }
        });
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addPropertyFrame.setVisible(false);
                previousFrame.setVisible(true);
            }
        });

        // Add the content to the window.
        addPropertyPanel.setLayout(new BoxLayout(addPropertyPanel, BoxLayout.Y_AXIS));
        addPropertyPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addPropertyPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        addPropertyPanel.add(addressLabel);
        addPropertyPanel.add(addressField);
        addPropertyPanel.add(cityLabel);
        addPropertyPanel.add(cityField);
        addPropertyPanel.add(stateLabel);
        addPropertyPanel.add(stateField);
        addPropertyPanel.add(zipLabel);
        addPropertyPanel.add(zipField);
        addPropertyPanel.add(priceLabel);
        addPropertyPanel.add(priceField);
        addPropertyPanel.add(bedroomsLabel);
        addPropertyPanel.add(bedroomsField);
        addPropertyPanel.add(bathroomsLabel);
        addPropertyPanel.add(bathroomsField);
        addPropertyPanel.add(sqftLabel);
        addPropertyPanel.add(sqftField);
        addPropertyPanel.add(descriptionLabel);
        addPropertyPanel.add(descriptionField);
        addPropertyPanel.add(addPropertyButton);
        addPropertyFrame.add(addPropertyPanel);
        addPropertyFrame.add(goBack, BorderLayout.SOUTH);

        addPropertyFrame.setVisible(true);

        return addPropertyFrame;
    }

    private JFrame editAndDeletePropertyPage(JFrame previousFrame, JFrame nextFrame){
        JFrame editAndDeleteFrame = new JFrame("Edit or Delete Property");
        editAndDeleteFrame.setLayout(new BorderLayout());

        editAndDeleteFrame.setSize(400, 400);
        editAndDeleteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel editAndDeletePanel = new JPanel();


        /** DUMMY DATA */
        String column[] = {"propertyID", "Address", "City", "State", "Zip", "Price", "Bedrooms", "Bathrooms", "Sqft", "Description"};
        String propertyData[][] = {{"1", "1234 Main St", "San Diego", "CA", "92101", "1000000", "3", "2", "1000", "This is a house"}, {"2", "1234 Main St", "San Diego", "CA", "92101", "1000000", "3", "2", "1000", "This is a house"}};

        JTable table = new JTable(propertyData, column);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);



        // Insert a search bar to search for a property
        JLabel searchLabel = new JLabel("Search: ");
        JTextField searchField = new JTextField(20);
        searchField.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton searchButton = new JButton("Search");
        boolean searchFound = false;
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Search for the property
            }
        });

        if(searchFound){
            // Go to a new page to edit / delete the property
            JFrame editPropertyFrame = new JFrame("Edit Property");
            editPropertyFrame.setSize(400, 400);
            editPropertyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel editPropertyPanel = new JPanel();
            editPropertyPanel.setLayout(new BoxLayout(editPropertyPanel, BoxLayout.Y_AXIS));
            editPropertyPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            editPropertyPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Create text fields for each property attribute and fill them with the property's data
            JLabel addressLabel = new JLabel("Address: ");
            JTextField addressField = new JTextField(20);
            addressField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            addressField.setText("1234 Main St");

            JLabel cityLabel = new JLabel("City: ");
            JTextField cityField = new JTextField(20);
            cityField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            cityField.setText("San Diego");

            JLabel stateLabel = new JLabel("State: ");
            JTextField stateField = new JTextField(20);
            stateField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            stateField.setText("CA");

            JLabel zipLabel = new JLabel("Zip: ");
            JTextField zipField = new JTextField(20);
            zipField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            zipField.setText("92101");

            JLabel priceLabel = new JLabel("Price: ");
            JTextField priceField = new JTextField(20);
            priceField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            priceField.setText("1000000");

            JLabel bedroomsLabel = new JLabel("Bedrooms: ");
            JTextField bedroomsField = new JTextField(20);
            bedroomsField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            bedroomsField.setText("3");

            JLabel bathroomsLabel = new JLabel("Bathrooms: ");
            JTextField bathroomsField = new JTextField(20);
            bathroomsField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            bathroomsField.setText("2");

            JLabel sqftLabel = new JLabel("Sqft: ");
            JTextField sqftField = new JTextField(20);
            sqftField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            sqftField.setText("1000");

            JLabel descriptionLabel = new JLabel("Description: ");
            JTextField descriptionField = new JTextField(20);
            descriptionField.setAlignmentX(Component.CENTER_ALIGNMENT);
            /*** DUMMY DATA ***/
            descriptionField.setText("This is a house");

            JButton editPropertyButton = new JButton("Edit Property");
            editPropertyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Edit the property
                }
            });

            JButton deletePropertyButton = new JButton("Delete Property");
            deletePropertyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Delete the property
                }
            });

            JButton goBack = new JButton("Go Back");
            goBack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    editPropertyFrame.setVisible(false);
                    editAndDeleteFrame.setVisible(true);
                }
            });

            editPropertyPanel.add(addressLabel);
            editPropertyPanel.add(addressField);
            editPropertyPanel.add(cityLabel);
            editPropertyPanel.add(cityField);
            editPropertyPanel.add(stateLabel);
            editPropertyPanel.add(stateField);
            editPropertyPanel.add(zipLabel);
            editPropertyPanel.add(zipField);
            editPropertyPanel.add(priceLabel);
            editPropertyPanel.add(priceField);
            editPropertyPanel.add(bedroomsLabel);
            editPropertyPanel.add(bedroomsField);
            editPropertyPanel.add(bathroomsLabel);
            editPropertyPanel.add(bathroomsField);
            editPropertyPanel.add(sqftLabel);
            editPropertyPanel.add(sqftField);
            editPropertyPanel.add(descriptionLabel);
            editPropertyPanel.add(descriptionField);
            // Add the remaining buttons below in the same row
            editPropertyPanel.add(editPropertyButton, BorderLayout.SOUTH);
            editPropertyPanel.add(deletePropertyButton, BorderLayout.SOUTH);
            editPropertyPanel.add(goBack, BorderLayout.SOUTH);

            editPropertyFrame.add(editPropertyPanel);
            editPropertyFrame.setVisible(true);
            editAndDeleteFrame.setVisible(false);

        } else {
            // Display a message saying "No property found" in the search bar
            searchField.setText("No property found");

        }


        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editAndDeleteFrame.setVisible(false);
                previousFrame.setVisible(true);
            }
        });


        return editAndDeleteFrame;
    }
    // NEED TO CREATE THE FOLLOWING FUNCTIONS
    // Admin-manager page to add property rent details after property is rented
    // Report on rent history for a property
    // List of properties in a given city, local area,zip code, or price range
    // Check status of property based on property ID

    private JFrame propertyRentDetails(JFrame previousFrame, JFrame nextFrame){
        JFrame propertyRentDetailsFrame = new JFrame("Property Rent Details");
        propertyRentDetailsFrame.setSize(400, 400);

        propertyRentDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setSize(400, 400);


        JLabel propertyIdLabel = new JLabel("Property ID: ");
        JTextField propertyIdField = new JTextField(20);
        propertyIdField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel rentPerMonthLabel = new JLabel("Rent Per Month: ");
        JTextField rentPerMonthField = new JTextField(20);
        rentPerMonthField.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel hikePercentageLabel = new JLabel("Hike Percentage: ");
        JTextField hikePercentageField = new JTextField(20);
        hikePercentageField.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel tenantIdLabel = new JLabel("Tenant ID: ");
        JTextField tenantIdField = new JTextField(20);
        tenantIdField.setAlignmentX(Component.CENTER_ALIGNMENT);


        JButton addRentDetailsButton = new JButton("Add Rent Details");
        addRentDetailsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add the rent details to the database
            }
        });

        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                propertyRentDetailsFrame.setVisible(false);
                previousFrame.setVisible(true);
            }
        });

        panel.add(propertyIdLabel);
        panel.add(propertyIdField);
        panel.add(rentPerMonthLabel);
        panel.add(rentPerMonthField);
        panel.add(hikePercentageLabel);
        panel.add(hikePercentageField);
        panel.add(tenantIdLabel);
        panel.add(tenantIdField);
        panel.add(addRentDetailsButton);
        panel.add(goBack, BorderLayout.SOUTH);

        propertyRentDetailsFrame.add(panel);
        propertyRentDetailsFrame.setVisible(true);
        nextFrame.setVisible(false);

        return propertyRentDetailsFrame;
    }

    private JFrame rentHistory(JFrame previousFrame, JFrame nextFrame){
        JFrame rentHistoryFrame = new JFrame("Rent History");
        rentHistoryFrame.setSize(400, 400);
        rentHistoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setSize(400, 400);

        JLabel propertyIdLabel = new JLabel("Property ID: ");
        JTextField propertyIdField = new JTextField(20);
        propertyIdField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton getRentHistoryButton = new JButton("Get Rent History");
        getRentHistoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the rent history from the database
            }
        });

        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rentHistoryFrame.setVisible(false);
                previousFrame.setVisible(true);
            }
        });

        panel.add(propertyIdLabel);
        panel.add(propertyIdField);
        panel.add(getRentHistoryButton);
        panel.add(goBack, BorderLayout.SOUTH);

        rentHistoryFrame.add(panel);
        rentHistoryFrame.setVisible(true);
        nextFrame.setVisible(false);
        return rentHistoryFrame;
    }

    private JFrame propertiesInArea(JFrame previousFrame, JFrame nextFrame){
        JFrame propertiesInAreaFrame = new JFrame("Properties In Area, Locality, zip code, or price range");
        propertiesInAreaFrame.setSize(400, 400);
        propertiesInAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setSize(400, 400);

        JLabel areaLabel = new JLabel("Area: ");
        JTextField areaField = new JTextField(20);
        areaField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel localityLabel = new JLabel("Locality: ");
        JTextField localityField = new JTextField(20);
        localityField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel zipCodeLabel = new JLabel("Zip Code: ");
        JTextField zipCodeField = new JTextField(20);
        zipCodeField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel priceRangeLabel = new JLabel("Price Range: ");
        JTextField priceRangeField = new JTextField(20);
        priceRangeField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton getPropertiesButton = new JButton("Get Properties");
        getPropertiesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the properties from the database
            }
        });


        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                propertiesInAreaFrame.setVisible(false);
                previousFrame.setVisible(true);
            }
        });

        panel.add(areaLabel);
        panel.add(areaField);
        panel.add(localityLabel);
        panel.add(localityField);
        panel.add(zipCodeLabel);
        panel.add(zipCodeField);
        panel.add(priceRangeLabel);
        panel.add(priceRangeField);
        panel.add(getPropertiesButton);
        panel.add(goBack, BorderLayout.SOUTH);

        propertiesInAreaFrame.add(panel);
        propertiesInAreaFrame.setVisible(true);
        nextFrame.setVisible(false);

        return propertiesInAreaFrame;
    }

    private JFrame propertyStatus(JFrame previousFrame, JFrame nextFrame){
        JFrame propertyStatusFrame = new JFrame("Property Status");
        propertyStatusFrame.setSize(400, 400);
        propertyStatusFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setSize(400, 400);

        JLabel propertyIdLabel = new JLabel("Property ID: ");
        JTextField propertyIdField = new JTextField(20);
        propertyIdField.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton getPropertyStatusButton = new JButton("Get Property Status");
        getPropertyStatusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the property status from the database
            }
        });

        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                propertyStatusFrame.setVisible(false);
                previousFrame.setVisible(true);
            }
        });

        panel.add(propertyIdLabel);
        panel.add(propertyIdField);
        panel.add(getPropertyStatusButton);
        panel.add(goBack, BorderLayout.SOUTH);

        propertyStatusFrame.add(panel);
        propertyStatusFrame.setVisible(true);
        nextFrame.setVisible(false);

        return propertyStatusFrame;
    }


    public void runApp(){
        JFrame frame = new JFrame("Real Estate App");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(150, 150, 10, 10));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton login = new JButton("Login");
        JButton dba = new JButton("DBA Sign In");
        panel.add(login);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(dba);
        frame.add(panel);
        frame.setVisible(true);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame loginFrame = new JFrame("Login");
                loginFrame.setLayout(new BorderLayout());

                loginFrame.setSize(400, 400);
                loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel loginPanel = new JPanel();
                JLabel usernameLabel = new JLabel("Username: ");
                JTextField usernameField = new JTextField(20);
                usernameField.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel passwordLabel = new JLabel("Password: ");
                JPasswordField passwordField = new JPasswordField(20);
                passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton loginButton = new JButton("Login");
                loginButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        loginFrame.setVisible(false);
                        JFrame homeFrame = new JFrame("Home");
                        homeFrame.setSize(400, 400);
                        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                        JPanel homePanel = new JPanel();

                        homePanel.setLayout(new BoxLayout(homePanel, BoxLayout.Y_AXIS));
                        homePanel.setBorder(BorderFactory.createEmptyBorder(150, 150, 10, 10));
                        homePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

                        JLabel homeLabel = new JLabel("Home");

                        JButton propertyRentDetails = new JButton("Property Rent Details");
                        propertyRentDetails.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JFrame propertyRentDetailsFrame = propertyRentDetails(homeFrame, homeFrame);
                            }
                        });

                        JButton propertyStatus = new JButton("Property Status");
                        propertyStatus.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JFrame propertyStatusFrame = propertyStatus(homeFrame, homeFrame);
                            }
                        });

                        JButton rentHistory = new JButton("Rent History");
                        rentHistory.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JFrame rentHistoryFrame = rentHistory(homeFrame, homeFrame);
                            }
                        });

                        JButton propertyInArea = new JButton("Properties in Area");
                        propertyInArea.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JFrame propertiesInAreaFrame = propertiesInArea(homeFrame, homeFrame);
                            }
                        });





                        JButton logout = new JButton("Logout");
                        logout.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                homeFrame.setVisible(false);
                                frame.setVisible(true);
                            }
                        });
                        homePanel.add(homeLabel);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(propertyRentDetails);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(propertyStatus);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(rentHistory);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(propertyInArea);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(logout);
                        homeFrame.add(homePanel);
                        homeFrame.setVisible(true);
                    }
                });


                JButton goBack = new JButton("Go Back");
                goBack.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        loginFrame.setVisible(false);
                        frame.setVisible(true);
                    }
                });

                loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
                loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                loginPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

                loginPanel.add(usernameLabel);
                loginPanel.add(usernameField);
                loginPanel.add(passwordLabel);
                loginPanel.add(passwordField);
                loginPanel.add(loginButton);
                loginFrame.add(loginPanel);
                loginFrame.add(goBack, BorderLayout.SOUTH);

                loginFrame.setVisible(true);
            }
        });


        //On click dba sign in, go to dba sign in page
        dba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame loginFrame = new JFrame("DBA Login");
                loginFrame.setLayout(new BorderLayout());

                loginFrame.setSize(400, 400);
                loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel loginPanel = new JPanel();
                JLabel usernameLabel = new JLabel("Username: ");
                JTextField usernameField = new JTextField(20);
                usernameField.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel passwordLabel = new JLabel("Password: ");
                JPasswordField passwordField = new JPasswordField(20);
                passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton loginButton = new JButton("Login");
                // On click login button go to home page
                loginButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        loginFrame.setVisible(false);
                        JFrame homeFrame = new JFrame("DBA Home");
                        homeFrame.setSize(400, 400);
                        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JPanel homePanel = new JPanel();
                        // align items to center and vertically
                        homePanel.setLayout(new BoxLayout(homePanel, BoxLayout.Y_AXIS));
                        homePanel.setBorder(BorderFactory.createEmptyBorder(150, 150, 10, 10));
                        homePanel.setAlignmentX(Component.CENTER_ALIGNMENT);

                        JButton signup = new JButton("Add user");
                        signup.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(false);
                                JFrame signupFrame = new JFrame("Sign Up");
                                signupFrame.setLayout(new BorderLayout());

                                signupFrame.setSize(400, 400);
                                signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                JPanel signupPanel = new JPanel();
                                JLabel usernameLabel = new JLabel("Username: ");
                                JTextField usernameField = new JTextField(20);
                                usernameField.setAlignmentX(Component.CENTER_ALIGNMENT);

                                JLabel passwordLabel = new JLabel("Password: ");
                                JPasswordField passwordField = new JPasswordField(20);
                                passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
                                JLabel repeatPasswordLabel = new JLabel("Repeat Password: ");
                                JPasswordField repeatPasswordField = new JPasswordField(20);
                                repeatPasswordField.setAlignmentX(Component.CENTER_ALIGNMENT);
                                JRadioButton manager = new JRadioButton("Manager");
                                JRadioButton owner = new JRadioButton("Owner");
                                JRadioButton tenant = new JRadioButton("Tenant");
                                ButtonGroup group = new ButtonGroup();
                                group.add(manager);
                                group.add(owner);
                                group.add(tenant);
                                manager.setSelected(true);


                                JButton signupButton = new JButton("Sign Up");
                                JButton goBack = new JButton("Go Back");
                                goBack.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        signupFrame.setVisible(false);
                                        homeFrame.setVisible(true);
                                    }
                                });

                                signupPanel.setLayout(new BoxLayout(signupPanel, BoxLayout.Y_AXIS));
                                signupPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                                signupPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

                                signupPanel.add(usernameLabel);
                                signupPanel.add(usernameField);
                                signupPanel.add(passwordLabel);
                                signupPanel.add(passwordField);
                                signupPanel.add(repeatPasswordLabel);
                                signupPanel.add(repeatPasswordField);

                                signupPanel.add(manager);
                                signupPanel.add(owner);
                                signupPanel.add(tenant);

                                signupPanel.add(signupButton);
                                signupFrame.add(signupPanel);
                                signupFrame.add(goBack, BorderLayout.SOUTH);

                                signupFrame.setVisible(true);
                            }
                        });
                        JLabel homeLabel = new JLabel("DBA Home");
                        JButton logout = new JButton("Logout");
                        logout.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                homeFrame.setVisible(false);
                                frame.setVisible(true);
                            }
                        });

                        // Create 3 buttons for adding, updating, and deleting properties
                        JButton addProperty = new JButton("Add Property");
                        addProperty.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JFrame addPropertyFrame = addPropertyPage(homeFrame, homeFrame);
                                addPropertyFrame.setVisible(true);
                            }
                        });
                        JButton updateProperty = new JButton("Update or Delete Property");
                        updateProperty.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JFrame updatePropertyFrame = editAndDeletePropertyPage(homeFrame, homeFrame);
                                updatePropertyFrame.setVisible(true);
                            }
                        });


                        homePanel.add(homeLabel);
                        homePanel.add(signup);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(addProperty);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(updateProperty);
                        homePanel.add(Box.createRigidArea(new Dimension(0, 10)));
                        homePanel.add(logout);
                        homeFrame.add(homePanel);
                        homeFrame.setVisible(true);
                    }
                });


                JButton goBack = new JButton("Go Back");
                goBack.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        loginFrame.setVisible(false);
                        frame.setVisible(true);
                    }
                });

                loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
                loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                loginPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

                loginPanel.add(usernameLabel);
                loginPanel.add(usernameField);
                loginPanel.add(passwordLabel);
                loginPanel.add(passwordField);
                loginPanel.add(loginButton);
                loginFrame.add(loginPanel);
                loginFrame.add(goBack, BorderLayout.SOUTH);

                loginFrame.setVisible(true);
            }
        });

    }
}
class Main{
    public static void main(String[] args) {
       userInterface ui = new userInterface();
       ui.runApp();
    }
}
