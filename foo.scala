object TokenAlignment {

  sealed abstract class A
  case object B extends A
  case object Bb extends A
  case object Bbb extends A

  type C = Int
  type CC = String

  trait Eq[-A] extends Any { def eqv(x: A, y: A): Boolean }
  trait Hash[-A] extends Any with Eq[A] { def hash(x: A): Int }

  for {
    a <- List(1)
    aaa <- List(1)
  } yield 1

  for {
    a <- List(1)
    a = List(1)
    aaa = List(1)
  } yield 1
}
