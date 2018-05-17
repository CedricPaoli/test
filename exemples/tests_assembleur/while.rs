fn fct(a : i32)
{
    let mut y = 7;
    
    while y{
        a = y;
        
        while a
        {
            print !(a);
            a = a-1;
        }
        y = y-1;
    }
}

fn main() {
   fct(3);
}
