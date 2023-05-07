# pip install transformers

from transformers import pipeline

# Load the pipeline
keyword_extractor = pipeline("text2text-generation", model="transformer3/keywordextractor")

# Set the input text
text = "How do I use heaps in java, I am confused can anyone help"

# Generate the keywords using the pipeline
keywords = keyword_extractor(text, max_length=30, num_return_sequences=1)[0]['generated_text'].split(',')
# keywords = ['#'+s.strip() for s in keywords]
for i in range(len(keywords)):
    keywords[i] = keywords[i].strip().replace(" ", "_")
print(keywords)


def extract_keywords(text):
    # Generate the keywords using the pipeline
    keywords = keyword_extractor(text, max_length=30, num_return_sequences=1)[0]['generated_text'].split(',')
    # keywords = ['#' + s.strip() for s in keywords]

    for i in range(len(keywords)):
        keywords[i] = keywords[i].strip().replace(" ", "_")
    return keywords