# STATUS CODE
1XX → Informational
2xx → Success 
3xx → Redirection 
4xx → Client error 
5xx → Server error

client ---REQUEST [FAILURE FROM CLIENT SIDE][400 ERROR]-------> server --------RESPONSE [FAILURE FROM SERVER SIDE][500 ERROR]-------->client 

# IMPORTANT [200, 400, 500 SERIES ]

200 → OK [MOSTLY IN GET]
201 → CREATED [MOSTLY IN POST]
204 → NO ACCOUNT [SUCCESSFULLY BUT NO RESPONSE ]

301 → MOVED PERMANENTLY [ABC.COM MOVED TO 123.COM]

400 → BAD REQUEST 
401 → UNAUTHORIZED [wrong email and password][client side error]
403 → FORBIDDEN [tryng to access which is not supposed to] [normal user trying some admin user access]
404 → NOT FOUND [trying to access which is not there ]
405 → METHOD NOT ALLOWED [instead of get,you are doing post and all other http request ]

500 → INTERNET SERVER ERROR
502 → BAD GATEWAY []
503 → SERVICE UNAVAILABLE [server is down for maintenance ]


Feature	                              POST                        PUT	                           PATCH
Primary Use	                          Create new resource	      Replace entire resource	       Partial update to resource
Requires full data?	                  Yes (for the new item)	  Yes (all fields)	               No (only changed fields)
Idempotent?	                          ❌ No	                      ✅ Yes	                       ⚠ Depends (usually no)
What happens if you send it twice?	  Creates two records	      Updates to same final state	   Might change twice (e.g., increment)
Safe for caching?	                  No	                      Yes	                           No

https://fakeapi.platzi.com/en/rest/categories/


https://api.escuelajs.co/docs#/products
