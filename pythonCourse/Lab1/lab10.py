class Clothes(object):
    """Clothes in the shop. Clothes have the following properties:

    Attributes:
        __name: A string representing the name of the thing.
        __color: A string representing the color of the thing.
        __size: An int representing the size of the thing.
        __year: An int representin the year when things was made.
        __number: A float representing the number of things in shop.
        total_nuber:A static float representing the total number of things.
    """
    __name, __color, __size, __year, __number, total_number = "","",0,0,0.0,0.0
    
    def set_number(self, number):
        """Set the thing's number."""
        self.__number = number
        Clothes.total_number += number
        
       
    def __init__(self,  name="", color="", size=0, year=0, number=0.0):
        """Return a Customer object with 5 attributes: *name*, *color*,
        *size*,*year*, *number*.""" 
        self.__name = name
        self.__color = color
        self.__size = size
        self.__year = year
        self.set_number(number)
        
    
    def reset_values(self, name, color, size, year, number):
        """Reset values of object."""
        self.__name = name
        self.__color = color
        self.__size = size
        self.__year = year
        self.set_number(number)
        
    def to_string(self):
        """Print object."""
        print("Name: " + self.__name + ", color: "+self.__color+
        ", size: " + str(self.__size)+ ", year: "+str(self.__year)+
        ", number: " + str(self.__number))

    def print_number(self):
        """Print number of things."""
        print("The total number of " + self.__name + " is "+ str(self.__number))
   
    @staticmethod  
    def print_static_number():
        """Print the total number of things."""
        print("The total number is " + str(Clothes.total_number))


if __name__ == "__main__":
    skirt = Clothes("Skirt", "blue", 42, 2015)
    shirt = Clothes("Shirt", "red", 46, 2017, 25)
    trousers = Clothes ("Trousers", "pink", 44, 2014, 15)
   
    print("Objects:")
    skirt.to_string()
    shirt.to_string()
    trousers.to_string()
    print("")
     
    shirt.print_number()
    trousers.print_number()
    Clothes.print_static_number()
    
    print("")
    skirt.reset_values("Skirt", "blue", 42, 2015, 12)
    
    skirt.to_string()
    skirt.print_number()
    Clothes.print_static_number()
