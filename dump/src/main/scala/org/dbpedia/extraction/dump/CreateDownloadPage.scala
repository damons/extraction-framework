package org.dbpedia.extraction.dump

object CreateDownloadPage {
  
  def main(args: Array[String]) {
    print(intro("3.7", "3.6", "3.5.1", "3.0RC"))
  }
  
  /**
   * @param current current version number, e.g. "3.7"
   * @param previous previous version numbers, e.g. "3.6", "3.5.1", "3.0RC"
   */
  def intro(current: String, previous: String *): String = {
"==DBpedia "+current+" Downloads==\n"+
"\n"+
"This pages provides downloads of the DBpedia datasets. The DBpedia datasets are licensed under the terms of the " +
"((http://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License Creative Commons Attribution-ShareAlike License)) " +
"and the ((http://en.wikipedia.org/wiki/Wikipedia:Text_of_the_GNU_Free_Documentation_License GNU Free Documentation License)). " +
"http://m.okfn.org/images/ok_buttons/od_80x15_red_green.png The downloads are provided as N-Triples and N-Quads, " +
"where the N-Quads version contains additional provenance information for each statement. All files are bz2 packed.\n"+
"\n"+
// ((Downloads36 DBpedia 3.6)), ((Downloads35 DBpedia 3.5.1)), ...
"Older Versions: "+previous.map(v => "((Downloads"+v.replace(".", "")+" DBpedia "+v+"))").mkString(", ")+"\n"+
"\n"+
"See also the ((ChangeLog change log)) for recent changes and developments.\n"+
"\n"+
"{{ToC numerate=1 from=h2 to=h2}}\n"
  }
}