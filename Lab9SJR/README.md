I chose to utilize the ChainHashMap because it's fast and had all the methods I assumed I needed.
It does take up more space than the linearProbe, but I thouht it was worth it not really having to
worry about collisions potentially slowing things down.

I chose to implement the 7 methods below: 

size()
isEmpty()
add()
contains()
remove()
clear()
keySet() 

From what I've read keySet() is not necessarily needed but, it felt wrong not having a way to access what's stored in the set, so I added it in there for fun, and just in case. 

Since a set only cares about the existence of elements (not values), I used true as a dummy value when storing keys in the map. This let me use the map’s put() and get() methods without needing a real value tied to each element.