fn func(a : bool){
  print!("C'est")
}

fn main() {

  /* Struct undefined */
  let b = mystruct { a = 5};
  let c = d;
  let e = 6;

  let a = false;

  /*Function undefined*/
  myfonction();

  /* Pas assez d'arg */
  func();

  /* Trop d'arg */
  func(a,a,a);

  /* Mauvais type d'arg dans la fonction */
  func(e);
}
