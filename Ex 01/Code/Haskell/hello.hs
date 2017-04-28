
main = do
  -- ask for input
  putStrLn "Hey what's your name?"
  -- read input
  name <- getLine
  -- print output
  putStrLn ("Hello " ++ name ++ "!")
