
Path to main class containing APIs:

springbootrest/src/main/java/com/cashfree/BankingResource.java



Assumptions:

1)data is clean 
2)have not handled NA cases for any of the fields(city or state)
3)Third Party Librarries used:opencsv-5.1.jar


sample API calls and Responses
-------------------------------
-------------------------------

1) Get all the banks which are in the given city and state


http://localhost:8080/getBanksByCityAndState?city=NA&state=MAHARASHTRA

Response:
[
    "ALLAHABAD BANK",
    "DEVELOPMENT BANK OF SINGAPORE",
    "BNP PARIBAS",
    "NATWEST MARKETS PLC",
    "ADITYA BIRLA IDEA PAYMENTS BANK",
    "UNITED OVERSEAS BANK LTD.",
    "NAV JEEVAN CO OP BANK LTD",
    "RBL BANK LIMITED",
    "SURYODAY SMALL FINANCE BANK LIMITED",
    "NATIONAL BANK FOR AGRICULTURE AND RURAL DEVELOPMENT",
    "NAINITAL BANK LTD.",
    "YES BANK",
    "BASSEIN CATHOLIC COOPERATIVE BANK LIMITED",
    "BARCLAYS BANK PLC",
    "THANE DISTRICT CENTRAL CO-OP. BANK LTD.",
    "THE SEVA VIKAS COOPERATIVE BANK LIMITED",
    "VISHESHWAR SAHAKARI BANK LTD.",
    "BANK OF MAHARASHTRA",
    "JANATA SAHAKARI BANK LTD., PUNE",
    "SHINHAN BANK",
    "WESTPAC BANKING CORPORATION",
    "The Muslim Co-operative Bank Ltd",
    "CORPORATION BANK",
    "JANAKALYAN SAHAKARI BANK LTD.",
    "SANT SOPANKAKA SAHAKARI BANK LTD",
    "STANDARD CHARTERED BANK LTD.",
    "KALYAN JANATA SAH BANK LTD",
    "RAJARAMBAPU SAHAKARI BANK LIMITED",
    "DOMBIVLI NAGARI SAHAKARI BANK",
    "BARAMATI SAHAKARI BANK LIMITED",
    "BHAGINI NIVEDITA SAHAKARI BANK LTD., PUNE",
    "KOTAK MAHINDRA BANK LIMITED",
    "SOLAPUR JANATA SAHAKARI BANK LTD.",
    "LAXMI VILAS BANK",
    "SAHEBRAO DESHMUKH CO-OP BANK LTD.",
    "TJSB SAHAKARI BANK LTD.",
    "RAJGURUNAGAR SAHAKARI BANK LIMITED",
    "THE SHAMRAO VITHAL COOPERATIVE BANK",
    "PUNJAB NATIONAL BANK",
    "SYNDICATE BANK",
    "HASTI COOPERATIVE BANK LTD.",
    "The Malkapur Urban Co Operative Bank Ltd Malkapur",
    "GS Mahanagar Co-operative Bank Limited, Mumbai",
    "NASIK MARCHANT'S CO-OP BANK LTD.",
    "DEOGIRI NAGARI SAHAKARI BANK LTD. AURANGABAD",
    "VIJAYA BANK",
    "EMIRATES NBD BANK (P.J.S.C)",
    "ANDHRA BANK",
    "SOUTH INDIAN BANK",
    "DCB BANK LIMITED",
    "Satara Sahakari Bank Ltd",
    "SURAT PEOPLES COOP BANK LTD.",
    "INDUSIND BANK",
    "Ujjivan Small Finance Bank Limited",
    "SATARA DISTRICT CENTRAL CO OP BANK LTD",
    "UNITED BANK OF INDIA",
    "SOCIETE GENERALE",
    "UTKARSH SMALL FINANCE BANK",
    "VASAI JANATA SAHAKARI BANK LTD.",
    "VASAI VIKAS SAHAKARI BANK LTD.",
    "ORIENTAL BANK OF COMMERCE",
    "SARASWAT COOPERATIVE BANK LIMITED",
    "The Ajara Urban Co op Bank Ltd Ajara",
    "NAGAR URBAN COOPERATIVE BANK LTD.",
    "JANA SMALL FINANCE BANK LTD",
    "THE KOLHAPUR URBAN CO-OP. BANK LTD.",
    "UNION BANK OF INDIA",
    "ZOROASTRIAN COOPERATIVE BANK LTD.",
    "AXIS BANK",
    "SHIKSHAK SAHAKARI BANK LIMITED",
    "THANE BHARAT SAHAKARI BANK LTD.",
    "TAMILNAD MERCANTILE BANK LTD",
    "QATAR NATIONAL BANK Q.P.S.C",
    "The Pusad Urban Cooperative Bank Ltd Pusad",
    "KARNATAKA BANK LIMITED",
    "UCO BANK",
    "CANARA BANK",
    "NEW INDIA CO-OP BANK",
    "COSMOS CO-OPERATIVE  BANK",
    "UJJIVAN SMALL FINANCE BANK LIMITED",
    "SHRI VEERSHAIV CO-OP. BANK LTD.",
    "BHARAT COOPERATIVE BANK LTD",
    "THE SINDHUDURG DISTRICT CENTERIAL CO-OP BANK LTD",
    "DEPOSIT INSURANCE AND CREDIT GUARANTEE CORPN",
    "IDBI BANK",
    "GOPINATH PATIL PARSIK JANATA SAHAKARI BK LTD.",
    "NKGSB COOP BANK LTD.",
    "DEUTSCHE BANK LTD",
    "CENTRAL BANK OF INDIA",
    "JANASEVA SAHAKARI BANK (BORIVLI) LTD.",
    "SUMITOMO MITSUI BANKING CORPORATION",
    "SAMARTH SAHAKARI BANK LTD",
    "IDFC First Bank Ltd",
    "MAHARASHTRA GRAMIN BANK",
    "THE ODISHA STATE COOPERATIVE BANK LTD",
    "CITI BANK",
    "SBM BANK INDIA LIMITED"
]

--------------------------------------------------------------------------------------------

2) Find the banks with a given prefix

http://localhost:8080/getBanksByPrefix?prefix=a


Response:
[
    "APNA SAHAKARI BANK LIMITED",
    "ANDHRA BANK",
    "ANDHRA PRAGATHI GRAMEENA BANK",
    "AXIS BANK",
    "ALLAHABAD BANK",
    "ABHYUDAYA COOPERATIVE BANK LIMITED",
    "AU SMALL FINANCE BANK LIMITED",
    "Ambika Mahila Sahakari Bank Ahmednagar",
    "AHMEDNAGAR MERCHANTS CO-OP BANK LTD",
    "ANDHRA PRADESH GRAMEENA VIKAS BANK",
    "ALMORA URBAN COOPERATIVE BANK LIMITED",
    "A P MAHESH CO-OP URBAN BANK LTD.",
    "Allahabad Up Gramin Bank",
    "AKOLA JANATA COMMERCIAL COOPERATIVE BANK",
    "AUSTRALIA AND NEW ZEALAND BANKING GROUP LIMITED",
    "AHMEDABAD MERCANTILE COOPERATIVE BANK",
    "ADITYA BIRLA IDEA PAYMENTS BANK",
    "AIRTEL PAYMENTS BANK LIMITED",
    "ABU DHABI COMMERCIAL BANK",
    "Allahabad Bank",
    "AMBARNATH JAIHIND COOP BANK LTD AMBARNATH",
    "Adilabad District Co-operative Central Bank"
]



-------------------------------------------------------------------------------------------------------------



3) Get all the banks with a given city and prefix

http://localhost:8080/getBanksByCityAndPrefix?city=NA&prefix=a

Response:
[
    "A P MAHESH CO-OP URBAN BANK LTD.",
    "ANDHRA PRADESH GRAMEENA VIKAS BANK",
    "Allahabad Up Gramin Bank",
    "ANDHRA BANK",
    "ADITYA BIRLA IDEA PAYMENTS BANK",
    "AIRTEL PAYMENTS BANK LIMITED",
    "AXIS BANK",
    "ALLAHABAD BANK",
    "Allahabad Bank",
    "AU SMALL FINANCE BANK LIMITED",
    "Ambika Mahila Sahakari Bank Ahmednagar",
    "Adilabad District Co-operative Central Bank"
]

------------------------------------------------------------------------------------------------------------------

Optimisations that can be done:

1) we Can maintain two hashmaps 
	HashMap<city , Set<String> BankNames> and
	HashMap<state , Set<String> BankNames> 
 		and do interesection of sets to access faster. 

2) taking APIkey as parameter and checking against db for authorisation
3) Limiting based on rate limiter value for each user for a particular period of time
4) Tracking all API requests and users for analytic purposes.
