// Task 12.4.1: Circle class
class Circle constructor(var point:Point, var radius:Double)
{
    init
    {
        require(radius>0,{"Radius must be positive!"})
    }
}