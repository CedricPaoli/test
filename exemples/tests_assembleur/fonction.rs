fn fct(a : i32, b : i32) -> i32
{
    print !(a);
    print !(b);
    
    a = 2*a+b;
    return a;
}

fn main() {
   print !(5);
   print !(fct(7, 4));
}

