
/**
 * 
 * HW 2 - CSCI 221 Fall 2016
 * 
 * Extension of Company class developed for hypothetical LinkedIn application.
 * from Programming Project 1 - CSCI 221, Fall 2016
 *
 * @ 221 teaching staff
 */
public class Company {
	
	// ---------------------------
	// Private instance variables
	// ---------------------------
	private String name = "";
	private char type;			
	private int year;
	private int employees = 0;
	private int id = -1;
	private Company parent = null;
    private static int Icount = 0;
    private static int Ocount = 0;
    private static int Dcount = 0; 
	
	/**
	 * Overloaded Constructor
	 * 4-parameters
	 * 
	 * @param name
	 * @param year
	 * @param employee
	 * @param type
	 */
	public Company( String name, int year, int employees, char type ) {
		
		// call 6-parameter constructor
		// pass in arguments
		
		this( name, type, null, year, employees, -1 );
		
	} // end 4-parameter overloaded constructor
	
	/**
	 * 
	 * * Overloaded Constructor
	 * 6-parameters
	 * 
	 * @param name
	 * @param type
	 * @param parent
	 * @param year
	 * @param employees
	 * @param id
	 */
	public Company( String name, char type, Company parent, int year, int employees, int id ) {
		
		setName( name );
		setType( type );
		setParent( parent );
		setYearFounded( year );
		setNumberOfEmployees( employees );
		setId( id );
                if (type == 'I') Icount++;
                else if (type == 'O') Ocount++;
                else Dcount++;
		
	} // end 6-parameter overloaded constructor
        
        /**
         * Constructor that copies the current object
         */
      public Company( Company c ){
            
            setName( c.name );
	    setType( c.type );
	    setParent( c.parent );
	    setYearFounded( c.year );
	    setNumberOfEmployees( c.employees );
	    setId( c.id );
            
        }
	
	/**
	 * Sets the name of the company
	 * Pre-Condition: name argument passed into method
	 * Post-Condition: name instance variable value set 
	 *                 equal to argument value
	 * 
	 * @param name of a Company instance
	 */
	public void setName( String name ) {
		
		// This is only for debug purposes
		assert( name.isEmpty() || name == null ) : "name argument not valid";
		
		if ( !name.isEmpty() && name != null ) {
			
			this.name = name;
			
		}
		
	} // end setName() method
	
	/**
	 * Retrieves name of the company
	 * Pre-Condition: none
	 * Post-Condition: value in name instance variable returned
	 * 
	 * @return the name of the Company it is called on
	 */
	public String getName() {
		
		// This is only for debug purposes
		assert( name.isEmpty() || name == null ) : "name return value not valid";
		
		return name;
		
	} // end getName() method
	
	
	/**
	 * Sets the type of a company
	 * Pre-Conditions: type argument passed into method.
	 *                 value one of 3 characters (O,D,I)
	 */
	public void setType( char type ) {
		
		
		if ( type == 'O' || type == 'D' || type == 'I' ) {
			
			this.type = type;
			
		}
		
	} // end setType() method
	
	/**
	 * Retrieves the type of a Company
	 * Pre-Conditions: none
	 * Post-Condition: type instance variable returned
	 * 
	 * @return returns the type indicator
	 */
	public char getType() {
		
		// This is only for debug purposes
		assert( type != 'O' && type != 'D' && type != 'I' ) : "type return value not valid";
		
		return type;
		
	} // end getType() method
	
	/**
	 * Stores the parent company
	 * Pre-Conditions: parent argument passed into method.
	 * 			       parent not equal to null
	 * Post-Condition: parent instance variable value set 
	 *                 equal to argument value only if 
	 *                 not equal to null. 
	 * @param parent
	 */
	public void setParent( Company parent ) {
		
		// This is only for debug purposes
		assert( parent == null ) : "parent argument not valid";
		
		if ( parent != null ) {
			
			this.parent = parent;
			
		}
		
	} // end setParent() method
	
	/**
	 * Retrieves the parent company
	 * Pre-Conditions: none
	 * Post-Condition: parent instance variable returned
	 * 
	 * @return a reference to the parent company
	 */
	public Company getParent() {
		
		// This is only for debug purposes
		assert( parent == null ) : "parent return value not valid";
		
		return parent;
		
	} // end getParent() method
	
	/**
	 * Stores the year the company was founded
         * Pre-Conditions: year argument passed into method
	 * Post-Condition: year instance variable value set 
	 *                 equal to argument value (no check
	 *                 required)
	 * @param year the company was founded
	 */
	public void setYearFounded( int year ) {
		
		// This is only for debug purposes
		assert ( year < 1000 ) : "year argument not valid";
		
		// Don't worry about invalid dates
		this.year = year;
		
	} // end setYearFounded() method
	
	/**
	 * Retrieves the year the company was founded
	 * Pre-Conditions: none
	 * Post-Condition: year instance variable returned
	 * @return the year the company founded
	 */
	public int getYearFounded() {
		
		// This is only for debug purposes
		assert ( year < 1000 ) : "year return value not valid";
		
		return year;
		
	} // end getYearFounded() method
	
	/**
	 * Store number of employees in this company
         * Pre-Conditions: employee argument passed into method
	 *                 expecting value to be > 0
	 * Post-Condition: employee instance variable value set 
	 *                 equal to argument value if > 0
	 *                 
	 * @param employees the number of employees
	 */
	public void setNumberOfEmployees( int employees ) {
		
		// This is only for debug purposes
		assert( employees < 1 ) : "employee argument not valid";
		
		if ( employees > 0 ) {
			
			this.employees = employees;
			
		}
		
	} // end setNumberOfEmployees() method
	
	/**
	 * Accesses number of employees of this company
	 * Pre-Conditions: none
	 * Post-Condition: year instance variable returned
	 * 
	 * @return number of employees of this company
	 */
	public int getNumberOfEmployees() {
		
		// This is only for debug purposes
		assert( employees < 1 ) : "employee return value not valid";
		
		return employees;
		
	} // end getNumberOfEmployees() method
	
	/**
	 * Store a company id
	 * Pre-Conditions: id argument passed into method
	 * 		           expecting value >= 0
	 * Post-Condition: id instance variable value set 
	 *                 equal to argument value if >= 0
	 *                 
	 * @param id the id number of a company
	 */
	public void setId( int id ) {
		
		// This is only for debug purposes
		assert( id < 0 ) : "id argument not valid";
		
		if ( id >= 0 ) {
			
			this.id = id;
			
		}
		
	} // end setId() method
	
	/**
	 * Returns a company's id
	 * Pre-Conditions: none
	 * Post-Condition: id instance variable returned
	 * 
	 * @return the id number of a company
	 */
	public int getId() {
		
		// This is only for debug purposes
		assert( id < 0 ) : "id return value not valid";
		
		return id;
		
	} // end getId() method
	
	/**
	 * Determines if this company has more employees than another company
	 * Pre-Conditions: Company object passed into method, argument 
	 * 				   is not null
	 * Post-Condition: this company number of employees instance variable 
	 * 				   value compared to argument company number of employees. 
	 * 				   if argument is not null, and this company has more
	 * 				   employees return true;
	 *                 
	 * @param c the name of a company to compare to
	 * @return true if this company bigger than parameter company
	 */
	public boolean isBigger( Company c ) {
		
		// This is only for debug purposes
		assert( c == null ) : "company argument not valid";
		
		boolean isBigger = false;
		
		if ( c != null ) {
			
			if ( this.getNumberOfEmployees() > c.getNumberOfEmployees() ) {
				
				isBigger = true;
				
			}
			
		}
		
		return isBigger;
		
	} // end isBigger() method
	
	/**
	 * Static method to compare any two companies
	 * Pre-Conditions: Company objects passed into method and are not null
	 * Post-Condition: c1 company number of employees instance variable 
	 * 				   value compared to c2 company number of employees 
	 * 				   instance variable value. If argument both are 
	 * 				   not null, and c1 company has more employees than 
	 * 				   c2 return true;
	 * 
	 * @param c1 one company to be compared to second company
	 * @param c2 secomd company
	 * @return true if c1 has more employees than c2, else false
	 */
	public static boolean isBigger( Company c1, Company c2 ) {
		
		// This is only for debug purposes
		assert( c1 == null || c2 == null ) : "company argument(s) not valid";
		
		boolean isBigger = false;
		
		if ( c1 != null && c2 != null ) {
			
			if ( c1.getNumberOfEmployees() > c2.getNumberOfEmployees() ) {
				
				isBigger = true;
				
			}
			
		}
		
		return isBigger;
		
	} // end isBigger() method
	
	/**
	 * Returns a String representation for the current company
	 * Pre-Conditions: none
	 * Post-Condition: Return formatted information in String
	 * 				   if id >= 0 include id, else do not.
	 * 				   Example,
	 *                 "D company SuperMaster. Id 34. Founded 2005. Has 1000 employees"
	 * 
	 * @return a string describing this company
	 */
	public String getDescription() {
		
		// This is only for debug purposes
		assert( getId() < 0 ) : "Id not included in description";
		
		String description;
		
		if ( getId() >= 0 ) {
			
			description = getType() + " company " +  getName() + ". Id "+ getId() +". Founded " + getYearFounded() +". Has "+getNumberOfEmployees() +"  employees";
		
		} else {
			
			description = getType() + " company " +  getName() + ". Founded " + getYearFounded() +". Has "+getNumberOfEmployees() +"  employees";
			
		}
                
                // Optional, print parent if it exists
                if (getParent() != null)
                    description += ". Parent: " + getParent().getName();
		
		return description;
		
	} // end getDescription() method
        
        /**
         * Return the number of international companies
         * @return Icount
         */
        public static int numberOfInternationalCompanies(){
            return Icount;
        }
        /**
         * Return the number of overseas companies
         * @return Ocount
         */
        public static int numberOfOverseasCompanies(){
            return Ocount;
        }
        /**
         * Return the number of domestic companies
         * @return Dcount
         */
        public static int numberOfDomesticCompanies(){
            return Dcount;
        }
        /**
         * Return the number of companies
         * @return sum of all company counts
         */
        public static int numberOfCompanies(){
            return Icount + Dcount + Ocount;
        }
        
        public boolean equals ( Company c ){
            return equalsName(c) &&
                   type == c.type &&
	           parent == c.parent && 
                   year == c.year &&
                   employees == c.employees &&
                   equalsID(c);
        }
        
        public boolean equalsID ( Company c ){
            return id == c.id;
        }
        
        public boolean equalsName ( Company c ){
            return name.equals(c.name);
        }
        
        public Company copy(){
            return new Company(this); // use the copy constructor
        }
        
        public static void main(String[] args) {
		
		
                
		// Create some companies
		
		Company c1 = new Company( "Apple", 1974, 10000, 'D' );
		Company c2 = new Company( "Dell", 'I', c1, 1980, 15000, 101 );
                Company c5 = new Company("Swell", 'I', c2, 1977, 2500, 102);
                
                // Test copy constructor
		Company c3 = new Company(c2);
                
                // Test copy method
                Company c4 = c3.copy();
                
                System.out.println( "---------Create objects-----------" );
		System.out.println( "c1:" + c1.getDescription() );
		System.out.println( "c2:" + c2.getDescription() );
                System.out.println( "c3:" + c3.getDescription() );
                System.out.println( "c4:" + c4.getDescription() );
		System.out.println( "c5:" + c5.getDescription() );
		
                
                System.out.println( "\n---------Verify we made copies, not aliases -------" );
                // Verify that copies are copies by verifying that 
                // references don't have same addresses
                 // Are c2 and c3 different objects?
                System.out.println("c2 & c3 are different (should be true): " + (c2 != c3));
                // Are c4 and c3 different objects?
                System.out.println("c4 & c3 are different (should be true): " + (c4 != c3));
 
		// Check how many companies of each type
                System.out.println( "\n----------Check counts---------" );
                System.out.println("How many domestic companies? (Should be 1): " + Company.numberOfDomesticCompanies());
                System.out.println("How many international companies? (Should be 2): " + Company.numberOfInternationalCompanies());
	        System.out.println("How many overseas companies? (Should be 0): " + Company.numberOfOverseasCompanies());
                
                // Check equals methods
                System.out.println( "\n----------Check equals  methods---------" );
                System.out.println("Do c2 and c3 have same name? (Should be true): " + c2.equalsName(c3));
                System.out.println("Do c2 and c5 have same name? (Should be false): " + c2.equalsName(c5));
                System.out.println("Do c2 and c3 have same ID? (Should be true): " + c2.equalsID(c3));
                System.out.println("Do c2 and c1 have same ID? (Should be false): " + c2.equalsID(c5));
                
                System.out.println("Are c2 and c3 equals? (Should be true): " + c2.equals(c3));
                System.out.println("Are c2 and c1 equals? (Should be false): " + c2.equals(c5));
        
        } // end main() method

} // end Company class definition