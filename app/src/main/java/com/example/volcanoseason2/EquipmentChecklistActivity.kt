package com.example.volcanoseason2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView

class EquipmentChecklistActivity : AppCompatActivity() {

    val header : MutableList<String> = ArrayList()
    val body : MutableList<Any> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equipment_checklist)

        title = "Equipment Checklist"

        // populate ArrayLists here (busy work!)
        val longSleeve : MutableList<String> = ArrayList()
        longSleeve.add("Sun Hoodie")
        longSleeve.add("Blue Hoodie (if cold/winter)")

        val baseLayers : MutableList<Any> = ArrayList()
        baseLayers.add("Boxer Briefs")
        baseLayers.add("Compression Socks")
        baseLayers.add("Compression Leggings")
        baseLayers.add("Synthetic T-shirt")
//        baseLayers.add(longSleeve)  // will need to figure out how to get the String name here

        val midLayers : MutableList<String> = ArrayList()
        midLayers.add("Blue Vest")
        midLayers.add("Down Vest (optional)")

        val pants : MutableList<String> = ArrayList()
        pants.add("Softshell")
        pants.add("Hiking (if very hot)")
        pants.add("Shorts")
        pants.add("Belt")
        pants.add("GoreTex (if cold/winter")
        pants.add("Rain Shell (if rain)")

        val jackets : MutableList<String> = ArrayList()
        jackets.add("Softshell")
        jackets.add("Windbreaker")
        jackets.add("Rain Shell (if rain)")
        jackets.add("GoreTex (if cold/winter")
        jackets.add("Down Parka")

        val shellsAndOuterware : MutableList<Any> = ArrayList()
//        shellsAndOuterware.add(pants)
//        shellsAndOuterware.add(jackets)

        val headware : MutableList<String> = ArrayList()
        headware.add("Beanie")
        headware.add("Sun Hat")
        headware.add("Buff")
        headware.add("Helmet")
        headware.add("Headlamp")
        headware.add("Low-light Sunglasses")
        headware.add("Glacier Sunglasses")
        headware.add("Goggles (if cold/winter")

        val feet : MutableList<String> = ArrayList()
        feet.add("Ski Boots")
        feet.add("Approach Shoes")
        feet.add("Boot Crampons")
        feet.add("Yak Tracks (optional)")

        val hands : MutableList<String> = ArrayList()
        hands.add("Hydrahyde Gloves")
        hands.add("Glove Liners")
        hands.add("Mittens")

        val avyGear : MutableList<String> = ArrayList()
        avyGear.add("Beacon")
        avyGear.add("Shovel")
        avyGear.add("Probe")

        val gear : MutableList<Any> = ArrayList()
        gear.add("Skis (waxed and scraped)")
        gear.add("Poles")
        gear.add("Skins")
        gear.add("Skin Gloves")
        gear.add("Ice Axe")
        gear.add("Ski Crampons")
//        gear.add(avyGear)
        gear.add("Ski Straps")
        gear.add("Radios (both of them")
        gear.add("Leatherman")
        gear.add("Carabiners")

        val sunscreenKit : MutableList<String> = ArrayList()
        sunscreenKit.add("Sunscreen")
        sunscreenKit.add("Chapstick")
        sunscreenKit.add("Hand Towel")

        val toiletriesKit : MutableList<String> = ArrayList()
        toiletriesKit.add("Blue Bag/Wag Bag")
        toiletriesKit.add("Hand Sanitizer")

        val skiWallet : MutableList<String> = ArrayList()
        skiWallet.add("ID")
        skiWallet.add("Credit Card")
        skiWallet.add("Health Insurance")
        skiWallet.add("Caash")

        val foodAndWater : MutableList<String> = ArrayList()
        foodAndWater.add("Shot Blocks (one pack/hour")
        foodAndWater.add("Sandwich/Jerky")
        foodAndWater.add("Hydration Bladder")
        foodAndWater.add("0.5L Reserve Bladder")

        val electronics : MutableList<String> = ArrayList()
        electronics.add("Powerbank")
        electronics.add("AA Batteries (4x)")
        electronics.add("AAA Batteries (4x)")

        val safety : MutableList<Any> = ArrayList()
        safety.add("First Aid Kit")
//        safety.add(sunscreenKit)
//        safety.add(toiletriesKit)
//        safety.add(electronics)
//        safety.add(skiWallet)
        safety.add("Rescue Knife")
        safety.add("Firebiner")
        safety.add("Map/Compass")
        safety.add("Sam Splint")
//        safety.add(foodAndWater)

        val extras : MutableList<String> = ArrayList()
        extras.add("Binoculars")
        extras.add("Inclinometer")
        extras.add("Summit Beer")
        extras.add("Food Wraps")
        extras.add("Trash Bag")

        val camping : MutableList<String> = ArrayList()
        camping.add("Sleeping Bag")
        camping.add("Sleeping Pad")
        camping.add("Pillow")
        camping.add("Hammock")
        camping.add("Tent")
        camping.add("PJs")
        camping.add("Slippers")

        val trailhead : MutableList<Any> = ArrayList()
//        trailhead.add(camping)
        trailhead.add("Sandals")
        trailhead.add("Fresh Clothing")
        trailhead.add("Cooler")
        trailhead.add("Protein Food")
        trailhead.add("Water")
        trailhead.add("Chairs")
        trailhead.add("Shotski")

        body.add(baseLayers)
        body.add(midLayers)
        body.add(shellsAndOuterware)
        body.add(headware)
        body.add(feet)
        body.add(hands)
        body.add(gear)
        body.add(safety)
        body.add(extras)
        body.add(trailhead)

        header.add("Base Layers")
        header.add("Mid Layers")
        header.add("Shells/Outerware")
        header.add("Headware")
        header.add("Feet")
        header.add("Hands")
        header.add("Gear")
        header.add("Safety")
        header.add("Extras")
        header.add("Trailhead")

        var expandableListView : ExpandableListView = findViewById(R.id.expandableListView)
        expandableListView.setAdapter(ExpandableListAdapter(this, expandableListView, header, body))

    }
}