(ns converter-system.core
  (:gen-class))

(defn -main [& args]

(defn parse-number [s]
  (if (re-find #"^-?\d+\.?\d*$" s)
    (read-string s)))

 
(println "Program Converter from decimal to binary, hex, octal")
(println "Number for converting")
(let [bin (read-line)]
(println(format "Hex: %X" (parse-number bin)))
(println(format "Octal: %o"  (parse-number bin)))
(print"Binary: ") (println(Integer/toBinaryString (parse-number bin))))
 

 