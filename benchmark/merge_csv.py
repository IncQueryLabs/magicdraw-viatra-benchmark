import csv
import glob

files = []
readers = []
fields = set()

try:
    for filename in glob.glob('benchmark/results/*/*.csv'):
        try:
            fileobj = open(filename, 'r', newline='')
        except IOError:
            print("Failed to open {}".format(filename))
            continue
        files.append(fileobj)  # for later closing

        reader = csv.DictReader(fileobj)
        fields.update(reader.fieldnames)  # reads the first row
        readers.append(reader)

    with open('benchmark/results/all_results.csv', 'w', newline='') as outf:
        writer = csv.DictWriter(outf, fieldnames=sorted(fields))
        writer.writeheader()
        for reader in readers:
            # copy across rows; missing fields will be left blank
            for row in reader:
                writer.writerow(row)
finally:
    # close out open file objects
    for fileobj in files:
        fileobj.close()
