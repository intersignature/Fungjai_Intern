# Fungjai_Intern
Write Android application for recieve json containing track and zine types from api and show in list view type format.

# Requirement
Show data from json in listviews vertical and in each listview has two types. If type is 'zine' listview is show in vertical is sort from cover image, title and description and if type is 'track' listview is show in horizontal is have two groups first is cover image and second group is details are containing song and artist.

# Client API
- Retrofit

# External Library
- Cardview
- Recyclerview
- Picasso

# Example code service
```
@GET(Constants.MUSIC_LIST)
Call<List<DataModel>> getMusicList();
```
