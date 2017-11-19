(ns algorithms.insertion-sort)

(defn insert
  [l k]
  (concat (filter #(<= % k) l) [k] (filter #(> % k) l)))

(defn isort
  "An insertion sort implementation that keeps track of the whole (partially sorted) input sequence in each iteration"
  [input]
  (loop [i 1
         result input]
    ;; (println result) ;; uncomment to see how insertion works
    (if (>= i (count result))
      result
      (recur (inc i)
             (concat
               (insert (take i result) (nth result i))
               (take-last (- (- (count result) i) 1) result))))))
