fn fct2(x : i32) -> i32
{
    return 36;
}

fn fct(a : i32, b : i32) -> i32
{
    print !(a);
    print !(b);
    
    let c = {fct2(36);};
    print !(c);
    
    a = 2*a+b;
    return a;
}

fn main() {
   print !(5);
   print !(fct(7, 4));
}

