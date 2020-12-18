
/**
 * Считать из файла hdata_stock.csv данные в буфер
 * Преобразовать считанные данные в Tuple5
 * Вывести построчно в консоль считанные полученный результат
 */

object CollectionExampleOne {

  def main(args: Array[String]): Unit = {

    val bufferedSource = io.Source.fromFile("../hdata_stock.csv")

    val list_prices: Seq[(String, String, String, String, String)] = {
      bufferedSource.getLines()
    }.toSeq
      .map(s => s.split(";"))
      .map {
        case Array(f1, f2, f3, f4, f5) => (f1,f2, f3, f4, f5)
      }

    list_prices.foreach(y => {
      println(y)
    })

    bufferedSource.close

  }
}
