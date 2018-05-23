fn main() {
  let a = 4;
  let mut b = 5;

  /* Utilisation d'une Var non deff*/
  c = 6;

  /* Erreur d'attribution à une Cst*/
  let a = 3;

  /* Erreur de ré-attribution de var.*/
  let mut b = 6;

  /* Errur de typage */
  let b = true;
  
}
