fn main() {
  let mut v = 0;
  let mut c = &v;
  print!(c);
  print!(c);
  *c = 3;
  print!(v);
  
  v = 5;
  print!(*c);
  print!(v);
}
