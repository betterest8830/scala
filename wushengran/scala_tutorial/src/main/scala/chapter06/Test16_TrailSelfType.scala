package chapter06

object Test16_TrailSelfType {
  def main(args: Array[String]): Unit = {
  val user = new RegisterUser("alice", "1344")
  user.insert()
  }
}

class User(val name: String, val password: String)

trait UserDao{
  _: User =>
  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name}" )
  }
}

// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao

