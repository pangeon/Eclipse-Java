(ns pierwiastek.core
  (:gen-class)
  (:import java.lang.Math))

(def 
  e 0.000001)

(defn abs 
  [x] (if (< x 0) (- x) x))

(defn square 
  [x] (* x x))

(defn good-enough?
  [g x]
  (< (abs (-(square g) x)) e))

(defn avg 
  [x y]
  (/ (+ x y) 2)) 

(defn improve 
  [g x]
  (avg g (/ x g)))

(defn sqrt
  [g x]
  (if (good-enough? g x)
    g
    (sqrt (improve g x) x)))

(defn -main 
  []
  (println "Start")
  (def x (sqrt 3 4))
  (println x))



  
  
          
               
         

