(ns ray-tracer-clj.geom)

(deftype Tuple [^doubles values]
  clojure.lang.ILookup
  (valAt [_ k]
    (case k
      :x (aget values 0)
      :y (aget values 1)
      :z (aget values 2)
      :w (aget values 3)
      nil)))

(defn tuple [x y z w]
  (Tuple. (double-array [x y z w])))


(defn point? [t]
  (= 1.0 (:w t)))

(defn vector? [t]
  (= 0.0 (:w t)))
