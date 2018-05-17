fn main() {

   print !(0 || 0);
   print !(3 || 0);
   print !(123456 || 0);
   print !(0 || 3);
   print !(123456 || 3);
   print !(3 || 3);
   print !(0 || 123456);
   print !(123456 || 123456);
   print !(3 || 123456);
   
   print !(0 && 0);
   print !(3 && 0);
   print !(123456 && 0);
   print !(0 && 3);
   print !(123456 && 3);
   print !(3 && 3);
   print !(0 && 123456);
   print !(123456 && 123456);
   print !(3 && 123456);
}

