import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';
import 'package:flutter_svg/svg.dart';

class HomePage  extends StatelessWidget{
  const HomePage ({super.key});

  @override
  Widget build(BuildContext context){
    return Scaffold(
      backgroundColor: Colors.white,
      body: Header(),
    );
  }




  
  Container Header() {
    return  Container(
      color: const Color(0xff51A8FF),
      height: 350,
      width: double.infinity,
      padding: const EdgeInsets.all(16),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [

          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              const Text(
                "Hi Philippos",
                style: TextStyle(
                  fontSize: 16,
                  color: Color(0xffFFFFFF)
                ),
              ),

              Container(
                height: 50,
                width: 50,
                decoration: BoxDecoration(
                  color: Colors.white.withOpacity(0.09),
                  borderRadius: BorderRadius.all(
                    Radius.circular(10)
                  )
                ),
                child: SvgPicture.asset(
                  'assets/vectors/notification_icon.svg',
                  fit: BoxFit.none,
                  color: Colors.white,
                ),
              )
            ],
          ),


          const SizedBox(height: 20,),


          const Text(
            "Let's find \n your top doctor!",
            style: TextStyle(
              color: Colors.white,
              fontSize: 28,
              fontWeight: FontWeight.w600
            ),
          ),


          const SizedBox(height: 30,),


          const TextField(
            decoration: InputDecoration(
              filled: true,
                fillColor: Colors.white,
              prefixIcon: Icon(
                Icons.search,
                color: Colors.blueGrey,
                size: 28,
              ),
              hintText: "Search here...",
              hintStyle: TextStyle(
                fontWeight: FontWeight.w300
              ),
              border: OutlineInputBorder(
                borderSide: BorderSide.none,
                borderRadius: BorderRadius.all(
                  Radius.circular(50)
                )
              )
            ),
          )
        ],
      ),
    );
  }
}


